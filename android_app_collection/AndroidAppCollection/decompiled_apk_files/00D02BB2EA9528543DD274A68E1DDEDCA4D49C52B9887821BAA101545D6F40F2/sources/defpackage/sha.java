package defpackage;

import android.view.View;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: sha  reason: default package */
/* loaded from: classes7.dex */
final class sha implements cqkn<sbe> {
    final /* synthetic */ shb a;

    public sha(shb shbVar) {
        this.a = shbVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(sbe sbeVar, View view) {
        sbe sbeVar2 = sbeVar;
        if (!sbeVar2.d().booleanValue()) {
            this.a.v(sbeVar2);
            Iterator<sbe> it = this.a.b.iterator();
            while (it.hasNext()) {
                sbe next = it.next();
                next.e(next == this.a.f);
            }
            this.a.h();
            this.a.f();
        }
    }
}
