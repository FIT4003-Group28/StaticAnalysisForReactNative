package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: eah  reason: default package */
/* loaded from: classes3.dex */
final class eah implements ylw {
    final /* synthetic */ eai a;

    public eah(eai eaiVar) {
        this.a = eaiVar;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            for (File file : ((File) this.a.aR.get()).listFiles()) {
                file.delete();
            }
        }
    }
}
