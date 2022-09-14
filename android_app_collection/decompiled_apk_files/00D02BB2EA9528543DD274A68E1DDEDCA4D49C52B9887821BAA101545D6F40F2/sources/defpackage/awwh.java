package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: awwh  reason: default package */
/* loaded from: classes.dex */
public final class awwh {
    public static boolean a(final awwb awwbVar, Set<awvv<?>> set) {
        return dcft.j(set, new dbsl(awwbVar) { // from class: awwc
            private final awwb a;

            {
                this.a = awwbVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.c((awvv) obj).b();
            }
        });
    }

    public static boolean b(final awwb awwbVar, Set<awvv<?>> set) {
        return dcft.k(set, new dbsl(awwbVar) { // from class: awwe
            private final awwb a;

            {
                this.a = awwbVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.c((awvv) obj).a();
            }
        });
    }

    public static boolean c(@dzsi final awwb awwbVar, Set<awvv<?>> set) {
        return dcft.k(set, new dbsl(awwbVar) { // from class: awwg
            private final awwb a;

            {
                this.a = awwbVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                awwb awwbVar2 = this.a;
                return awwbVar2 != null && awwbVar2.a((awvv) obj).a();
            }
        });
    }
}
