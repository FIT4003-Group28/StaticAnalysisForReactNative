package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqie  reason: default package */
/* loaded from: classes.dex */
public class cqie extends cqho {
    private final cqhw a;
    protected final Context c;

    public cqie(Context context, cqhw cqhwVar) {
        super(context.getResources().getConfiguration());
        this.c = context;
        this.a = cqhwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(List<cqkv> list) {
        list.add(new cqib());
        list.add(new cqff(new cqfp(this), new cqlg()));
    }

    protected void b(cqpr<View> cqprVar) {
    }

    @Override // defpackage.cqho
    protected cqid e() {
        return new cqid(false);
    }

    @Override // defpackage.cqho
    protected final cqhu f() {
        return new cqhu();
    }

    @Override // defpackage.cqho
    protected final cqkj h() {
        return new cqkj(this.c, i(), m(), o());
    }

    @Override // defpackage.cqho
    protected final cqkd j() {
        cqpr<View> cqprVar = new cqpr<>();
        b(cqprVar);
        return new cqig(this.c, cqprVar);
    }

    @Override // defpackage.cqho
    protected final cqkv l() {
        ArrayList a = dchl.a();
        a(a);
        return new cqhd(a);
    }

    @Override // defpackage.cqho
    protected final cqhr n() {
        return new cqhr(this, this.a, k(), i());
    }

    @Override // defpackage.cqho
    protected final cqhw p() {
        return this.a;
    }

    @Override // defpackage.cqho
    protected final cqkr r() {
        return new cqkr();
    }
}
