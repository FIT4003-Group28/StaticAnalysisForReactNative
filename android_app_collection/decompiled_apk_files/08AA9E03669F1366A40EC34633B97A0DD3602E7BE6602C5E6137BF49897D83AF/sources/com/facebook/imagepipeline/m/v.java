package com.facebook.imagepipeline.m;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: LocalAssetFetchProducer.java */
/* loaded from: classes.dex */
public class v extends z {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f2910a;

    @Override // com.facebook.imagepipeline.m.z
    protected String a() {
        return "LocalAssetFetchProducer";
    }

    public v(Executor executor, com.facebook.common.g.h hVar, AssetManager assetManager) {
        super(executor, hVar);
        this.f2910a = assetManager;
    }

    @Override // com.facebook.imagepipeline.m.z
    protected com.facebook.imagepipeline.i.d a(com.facebook.imagepipeline.n.b bVar) {
        return b(this.f2910a.open(c(bVar), 2), b(bVar));
    }

    private int b(com.facebook.imagepipeline.n.b bVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor openFd = this.f2910a.openFd(c(bVar));
            try {
                int length = (int) openFd.getLength();
                if (openFd != null) {
                    try {
                        openFd.close();
                    } catch (IOException unused) {
                    }
                }
                return length;
            } catch (IOException unused2) {
                assetFileDescriptor = openFd;
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException unused3) {
                    }
                }
                return -1;
            } catch (Throwable th) {
                assetFileDescriptor = openFd;
                th = th;
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String c(com.facebook.imagepipeline.n.b bVar) {
        return bVar.b().getPath().substring(1);
    }
}
