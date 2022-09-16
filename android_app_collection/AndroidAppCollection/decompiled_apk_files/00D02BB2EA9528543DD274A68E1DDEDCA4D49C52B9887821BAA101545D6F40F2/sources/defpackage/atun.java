package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atun  reason: default package */
/* loaded from: classes2.dex */
public class atun extends atss<crqu> {
    private static final long a = TimeUnit.SECONDS.toMillis(5);
    private final Context b;
    private final String c;
    private final boolean d;

    public atun(crqu crquVar, btrm btrmVar, btvo btvoVar, cref crefVar, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, Context context, dehq dehqVar, Executor executor, atsr atsrVar, boolean z) {
        super(crquVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, a);
        String string;
        this.b = context;
        String i = bvtb.i(context, crquVar.d + (cqatVar.b() / 1000));
        this.c = i;
        boolean z2 = Math.abs(crquVar.c) >= 60;
        this.d = z2;
        if (z2) {
            string = context.getString(R.string.OPTIONS_CHANGE_NEW_ETA_PROMPT_TITLE, i);
        } else {
            string = context.getString(R.string.OPTIONS_CHANGE_SIMILAR_ETA_PROMPT_TITLE, i);
        }
        this.p = string;
        B(context.getString(R.string.VIA_ROADS_CLAUSE, crquVar.a));
        L(S(true).a());
        H(al());
    }

    @Override // defpackage.atss
    public crfj u() {
        String string;
        crfe q = this.i.q();
        if (this.d) {
            string = this.b.getString(R.string.OPTIONS_CHANGE_NEW_ETA_SPEECH, this.c);
        } else {
            string = this.b.getString(R.string.OPTIONS_CHANGE_SIMILAR_ETA_SPEECH, this.c);
        }
        return q.g(string);
    }
}
