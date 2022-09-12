package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: bcch  reason: default package */
/* loaded from: classes3.dex */
public final class bcch implements Factory<bcbw> {
    public static bcbw b(final bcce bcceVar) {
        bcceVar.getClass();
        return new bcbw(bcceVar) { // from class: bccf
            private final bcce a;

            {
                this.a = bcceVar;
            }

            @Override // defpackage.bcbw
            public final bcbx a() {
                return this.a.q();
            }
        };
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
