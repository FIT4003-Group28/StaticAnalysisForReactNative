package defpackage;

import android.content.Context;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bxqx  reason: default package */
/* loaded from: classes4.dex */
final class bxqx implements cqsn {
    final /* synthetic */ cqsn a;

    public bxqx(cqsn cqsnVar) {
        this.a = cqsnVar;
    }

    @Override // defpackage.cqsn
    public final CharSequence a(Context context) {
        return this.a.a(context).toString().toUpperCase(Locale.getDefault());
    }
}
