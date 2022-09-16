package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: djz  reason: default package */
/* loaded from: classes3.dex */
public final class djz implements Runnable {
    final /* synthetic */ List a;

    public djz(List list) {
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dlc.G(this.a);
    }
}
