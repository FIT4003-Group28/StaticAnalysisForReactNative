package com.facebook.imagepipeline.m;

import android.content.ContentResolver;
import java.util.concurrent.Executor;
/* compiled from: QualifiedResourceFetchProducer.java */
/* loaded from: classes.dex */
public class an extends z {

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f2787a;

    @Override // com.facebook.imagepipeline.m.z
    protected String a() {
        return "QualifiedResourceFetchProducer";
    }

    public an(Executor executor, com.facebook.common.g.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f2787a = contentResolver;
    }

    @Override // com.facebook.imagepipeline.m.z
    protected com.facebook.imagepipeline.i.d a(com.facebook.imagepipeline.n.b bVar) {
        return b(this.f2787a.openInputStream(bVar.b()), -1);
    }
}
