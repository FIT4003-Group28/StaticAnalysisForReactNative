package com.facebook.imagepipeline.m;

import java.io.FileInputStream;
import java.util.concurrent.Executor;
/* compiled from: LocalFileFetchProducer.java */
/* loaded from: classes.dex */
public class aa extends z {
    @Override // com.facebook.imagepipeline.m.z
    protected String a() {
        return "LocalFileFetchProducer";
    }

    public aa(Executor executor, com.facebook.common.g.h hVar) {
        super(executor, hVar);
    }

    @Override // com.facebook.imagepipeline.m.z
    protected com.facebook.imagepipeline.i.d a(com.facebook.imagepipeline.n.b bVar) {
        return b(new FileInputStream(bVar.o().toString()), (int) bVar.o().length());
    }
}
