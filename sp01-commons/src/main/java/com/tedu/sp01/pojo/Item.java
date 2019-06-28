package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	private Integer id;
	private String name;
<<<<<<< HEAD
=======
	@11
>>>>>>> branch 'master' of https://github.com/why121373/springcloud.git
	private Integer number;
}
