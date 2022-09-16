package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: ajix  reason: default package */
/* loaded from: classes.dex */
public final class ajix implements teo {
    private final teb a;
    private volatile ResourceLoader b;
    private final axnm c;
    private final aune d;
    private final boolean e;
    private final boolean f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final Context h;
    private final ResourceLoaderDelegate i;
    private final axnm j;

    public ajix(teb tebVar, aadd aaddVar, aacz aaczVar, axnm axnmVar, Context context, ResourceLoaderDelegate resourceLoaderDelegate, axnm axnmVar2, ampq ampqVar) {
        boolean z;
        this.a = tebVar;
        this.c = axnmVar;
        aunf aunfVar = aaczVar.b().l;
        aune auneVar = (aunfVar == null ? aunf.a : aunfVar).l;
        auneVar = auneVar == null ? aune.a : auneVar;
        this.d = auneVar;
        this.h = context;
        if (auneVar.d) {
            aunh aunhVar = aaddVar.a().k;
            if (!(aunhVar == null ? aunh.a : aunhVar).c) {
                z = true;
                this.f = z;
                this.i = resourceLoaderDelegate;
                this.j = axnmVar2;
                this.e = ((Boolean) ampqVar.e(false)).booleanValue();
            }
        }
        z = false;
        this.f = z;
        this.i = resourceLoaderDelegate;
        this.j = axnmVar2;
        this.e = ((Boolean) ampqVar.e(false)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0154 A[Catch: all -> 0x01e8, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x0019, B:11:0x001f, B:13:0x002e, B:15:0x0036, B:17:0x003e, B:19:0x0042, B:21:0x0048, B:23:0x004c, B:25:0x0052, B:27:0x0056, B:29:0x005b, B:31:0x005f, B:33:0x0064, B:35:0x0068, B:38:0x0075, B:40:0x0079, B:42:0x011b, B:50:0x014c, B:52:0x0154, B:54:0x017f, B:55:0x0185, B:57:0x01be, B:59:0x01c4, B:60:0x01c7, B:43:0x0127, B:45:0x013b, B:47:0x0145, B:46:0x0140, B:37:0x006f, B:61:0x01ce, B:62:0x01d5, B:63:0x01d6, B:64:0x01dd, B:65:0x01de, B:66:0x01e5, B:67:0x01e6), top: B:73:0x0007 }] */
    @Override // defpackage.teo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.elements.interfaces.ResourceLoader a() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajix.a():com.google.android.libraries.elements.interfaces.ResourceLoader");
    }

    @Override // defpackage.teo
    public final boolean b() {
        return this.f;
    }

    @Override // defpackage.teo
    public final boolean c() {
        return this.g.get();
    }
}
