package swm.wbj.asyncrum.domain.whiteboard.dto;

import lombok.Data;
import swm.wbj.asyncrum.domain.whiteboard.entity.Whiteboard;
import swm.wbj.asyncrum.global.type.ScopeType;

@Data
public class WhiteboardReadResponseDto {

    private String title;
    private String description;
    private String whiteboardUrl;
    private ScopeType scope;

    public WhiteboardReadResponseDto(Whiteboard whiteboard) {
        this.title = whiteboard.getTitle();
        this.description = whiteboard.getDescription();
        this.whiteboardUrl = whiteboard.getWhiteboardFileUrl();
        this.scope = whiteboard.getScope();
    }
}
