package defpackage;

import android.content.Context;
/* compiled from: PG */
@Deprecated
/* renamed from: cyhb  reason: default package */
/* loaded from: classes5.dex */
public final class cyhb extends cyhe {
    public cyhb(final Context context) {
        super(new cyhl(context), new cyhm(context), dbud.a(new dbty(context) { // from class: cygz
            private final Context a;

            {
                this.a = context;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return (cylx) czhd.a(this.a, cylx.class);
            }
        }), dbud.a(new dbty(context) { // from class: cyha
            private final Context a;

            {
                this.a = context;
            }

            @Override // defpackage.dbty
            public final Object a() {
                Context context2 = this.a;
                cyib cyibVar = (cyib) czhd.h(context2).c(cyib.class);
                return cyibVar != null ? cyibVar : new cyig(context2, new cyhv(context2));
            }
        }), (cqat) czhd.a(context, cqat.class));
    }
}
