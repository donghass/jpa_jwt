package org.fastcampus.community_feed.auth.repository.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEmailVerificationEntity is a Querydsl query type for EmailVerificationEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEmailVerificationEntity extends EntityPathBase<EmailVerificationEntity> {

    private static final long serialVersionUID = 1887556126L;

    public static final QEmailVerificationEntity emailVerificationEntity = new QEmailVerificationEntity("emailVerificationEntity");

    public final org.fastcampus.community_feed.common.repository.QTimeBaseEntity _super = new org.fastcampus.community_feed.common.repository.QTimeBaseEntity(this);

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isVerified = createBoolean("isVerified");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDt = _super.regDt;

    public final StringPath token = createString("token");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updDt = _super.updDt;

    public QEmailVerificationEntity(String variable) {
        super(EmailVerificationEntity.class, forVariable(variable));
    }

    public QEmailVerificationEntity(Path<? extends EmailVerificationEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmailVerificationEntity(PathMetadata metadata) {
        super(EmailVerificationEntity.class, metadata);
    }

}

