package defpackage;

import android.view.View;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: bdcn  reason: default package */
/* loaded from: classes3.dex */
public final class bdcn extends cjxe {
    private final View a;
    private final cqjg b;
    private final cqjg f;
    private boolean g;

    public bdcn(fd fdVar, View view, cqjg cqjgVar, cqjg cqjgVar2) {
        super(fdVar, dcnm.c());
        this.a = view;
        this.b = cqjgVar;
        this.f = cqjgVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cjxe
    public final void a(float f) {
        f();
        HashSet c = dcnm.c();
        cqkx.f(this.a, this.b, c);
        cqkx.f(this.a, this.f, c);
        i(c);
        super.a(f);
    }

    @Override // defpackage.cjxe
    public final void b(boolean z) {
        super.b(this.g);
    }

    public final void c(boolean z) {
        if (this.g && !z) {
            super.b(false);
        }
        this.g = z;
        if (!z || !this.e) {
            return;
        }
        super.b(true);
    }
}
