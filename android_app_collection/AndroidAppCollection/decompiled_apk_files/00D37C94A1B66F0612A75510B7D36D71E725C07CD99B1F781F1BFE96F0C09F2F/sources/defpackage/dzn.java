package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: dzn  reason: default package */
/* loaded from: classes3.dex */
final class dzn implements ylw {
    final /* synthetic */ dzs a;

    public dzn(dzs dzsVar) {
        this.a = dzsVar;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            for (File file : ((File) this.a.aq.get()).listFiles()) {
                file.delete();
            }
        }
    }
}
