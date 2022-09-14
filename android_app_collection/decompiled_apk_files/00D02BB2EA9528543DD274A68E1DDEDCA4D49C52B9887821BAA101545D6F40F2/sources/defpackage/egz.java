package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: egz  reason: default package */
/* loaded from: classes6.dex */
public final class egz {
    public final List<Animator> a;
    public final List<Animator> b;

    public egz() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = new ArrayList();
        arrayList.add(ValueAnimator.ofInt(0));
    }
}
