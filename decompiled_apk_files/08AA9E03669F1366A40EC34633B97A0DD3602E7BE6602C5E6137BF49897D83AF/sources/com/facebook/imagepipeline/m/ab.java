package com.facebook.imagepipeline.m;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: LocalResourceFetchProducer.java */
/* loaded from: classes.dex */
public class ab extends z {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f2726a;

    @Override // com.facebook.imagepipeline.m.z
    protected String a() {
        return "LocalResourceFetchProducer";
    }

    public ab(Executor executor, com.facebook.common.g.h hVar, Resources resources) {
        super(executor, hVar);
        this.f2726a = resources;
    }

    @Override // com.facebook.imagepipeline.m.z
    protected com.facebook.imagepipeline.i.d a(com.facebook.imagepipeline.n.b bVar) {
        return b(this.f2726a.openRawResource(c(bVar)), b(bVar));
    }

    private int b(com.facebook.imagepipeline.n.b bVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor openRawResourceFd = this.f2726a.openRawResourceFd(c(bVar));
            try {
                int length = (int) openRawResourceFd.getLength();
                if (openRawResourceFd != null) {
                    try {
                        openRawResourceFd.close();
                    } catch (IOException unused) {
                    }
                }
                return length;
            } catch (Resources.NotFoundException unused2) {
                assetFileDescriptor = openRawResourceFd;
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException unused3) {
                    }
                }
                return -1;
            } catch (Throwable th) {
                assetFileDescriptor = openRawResourceFd;
                th = th;
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static int c(com.facebook.imagepipeline.n.b bVar) {
        return Integer.parseInt(bVar.b().getPath().substring(1));
    }
}
