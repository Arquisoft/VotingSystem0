package es.uniovi.asw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;


@Controller
public class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  @RequestMapping("/")
  public ModelAndView landing(Model model) {
    return new ModelAndView("landing");
  }

  @RequestMapping("/sort")
  public ModelAndView sort(Model model) {
    Random random = new Random();
    LOG.info("Landing page access");
    long millis0 = System.currentTimeMillis();
    IntStream.range(1, 1000).forEach(i -> {
      IntStream randoms = IntStream.range(1, 100000).map(j -> random.nextInt());
      Arrays.asList(randoms.sorted().toArray());
    });
    long millis1 = System.currentTimeMillis();
    LOG.info("Elapsed: " + (millis1 - millis0));
    return new ModelAndView("sort");
  }
  
}