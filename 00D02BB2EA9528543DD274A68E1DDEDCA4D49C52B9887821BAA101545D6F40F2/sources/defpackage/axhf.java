package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: axhf  reason: default package */
/* loaded from: classes3.dex */
final class axhf<T> implements dzaz<Throwable> {
    final /* synthetic */ axhi a;
    final /* synthetic */ List b;
    final /* synthetic */ dqac c;

    public axhf(axhi axhiVar, List list, dqac dqacVar) {
        this.a = axhiVar;
        this.b = list;
        this.c = dqacVar;
    }

    @Override // defpackage.dzaz
    public final /* bridge */ /* synthetic */ void SR(Throwable th) {
        this.a.e.c(new axgs(this.b, this.c));
    }
}
