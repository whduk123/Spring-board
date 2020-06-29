package com.board.service;

import java.util.*;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

 @Inject
 private BoardDAO dao;
 
 @Override
 public List list() throws Exception {

  return dao.list();
 }
 @Override
 public void write(BoardVO vo) throws Exception {
 	dao.write(vo);
 	// TODO Auto-generated method stub
 	
 }
}