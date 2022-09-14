package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: chai  reason: default package */
/* loaded from: classes4.dex */
public class chai extends bopt implements cgwe {
    private boolean a;
    private final chah c;
    private final View.OnTouchListener d;

    public chai(Context context, String str, Integer num, ddho ddhoVar, @dzsi String str2, boolean z, cqjg cqjgVar, boolean z2, chah chahVar, cjqy cjqyVar, boolean z3, int i) {
        super(context, new bokk(true, "", false), "", str, str, "", num, 0, ddhoVar, str2, true, false, false, null, cqjgVar, z2, null, true, 1);
        this.a = false;
        this.c = chahVar;
        this.d = new chag(cjqyVar, ddhoVar);
    }

    @Override // defpackage.bopt, defpackage.boqs
    public Boolean A() {
        boolean z = false;
        if (!b().booleanValue() && super.A().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwe
    /* renamed from: G */
    public jmm c() {
        return new jmm(new jml(this) { // from class: chae
            private final chai a;

            {
                this.a = this;
            }

            @Override // defpackage.jml
            public final void a(CharSequence charSequence) {
                ((InputMethodManager) this.a.b.getSystemService("input_method")).toggleSoftInput(0, 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void H(CharSequence charSequence) {
        super.s().a(charSequence);
        this.c.a(l().booleanValue());
        cqkx.p(this);
    }

    @Override // defpackage.cgwe
    public void a(boolean z) {
        this.a = z;
        cqkx.p(this);
    }

    @Override // defpackage.cgwe
    public Boolean b() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.cgwe
    public View.OnTouchListener d() {
        return this.d;
    }

    @Override // defpackage.bopt, defpackage.boqs
    public cqgl s() {
        return new cqgl(this) { // from class: chaf
            private final chai a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                this.a.H(charSequence);
            }
        };
    }

    @Override // defpackage.bopt, defpackage.boqs
    public cqkl z() {
        cqkl z = super.z();
        cqkx.p(this);
        return z;
    }
}
