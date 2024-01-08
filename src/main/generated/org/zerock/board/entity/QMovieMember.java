package org.zerock.board.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMovieMember is a Querydsl query type for MovieMember
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMovieMember extends EntityPathBase<MovieMember> {

    private static final long serialVersionUID = 485774427L;

    public static final QMovieMember movieMember = new QMovieMember("movieMember");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath email = createString("email");

    public final NumberPath<Long> mId = createNumber("mId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modDate = _super.modDate;

    public final StringPath nickname = createString("nickname");

    public final StringPath pw = createString("pw");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDate = _super.regDate;

    public QMovieMember(String variable) {
        super(MovieMember.class, forVariable(variable));
    }

    public QMovieMember(Path<? extends MovieMember> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMovieMember(PathMetadata metadata) {
        super(MovieMember.class, metadata);
    }

}

