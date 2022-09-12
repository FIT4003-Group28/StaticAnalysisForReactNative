package defpackage;

import android.animation.Animator;
import android.view.View;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bcag  reason: default package */
/* loaded from: classes3.dex */
public final class bcag {
    public final View a;
    public final ArrayList<bcaf> b = new ArrayList<>();
    @dzsi
    public Animator.AnimatorListener c;

    public bcag(View view) {
        this.a = view;
    }

    public final void a(bcad<bcaf> bcadVar) {
        bcaf bcafVar = new bcaf(this);
        bcadVar.a(bcafVar);
        this.b.add(bcafVar);
    }
}
