package io.github.maodua.wrench.file.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class FilePool {
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**
     * 可以用户id,或者其他类型id
     */
    private String oid;
    /**
     * 是否存在本地
     */
    private Boolean local;
    /**
     * 文件的原始名称，只包括名称不包括路径
     */
    private String filename;
    /**
     * 文件类型(图片、音频、视频、文件)
     */
    private FileType filetype;
    /**
     * 文件的实际保存路径,或者文件访问url
     */
    private String filepath;
    /**
     * 文件的上传时间
     */
    private LocalDateTime addtime;
    /**
     * 文件的大小
     */
    private Long size;
    /**
     * 扩展字段
     */
    private String extend;
}
