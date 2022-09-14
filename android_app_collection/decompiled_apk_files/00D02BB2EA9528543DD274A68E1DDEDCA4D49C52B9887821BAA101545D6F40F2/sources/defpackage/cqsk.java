package defpackage;

import android.content.Context;
/* renamed from: cqsk  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cqsk {
    public static cqsn a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return new cqsh(charSequence);
    }

    public static cqjb b(final cqsn cqsnVar) {
        return new cqjb(cqsnVar) { // from class: cqsl
            private final cqsn a;

            {
                this.a = cqsnVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return this.a.a(context);
            }
        };
    }
}
