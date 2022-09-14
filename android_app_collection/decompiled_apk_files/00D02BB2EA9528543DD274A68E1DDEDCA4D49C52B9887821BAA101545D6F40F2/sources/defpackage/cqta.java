package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
/* compiled from: PG */
/* renamed from: cqta  reason: default package */
/* loaded from: classes.dex */
public final class cqta extends cqss {
    public final int a;

    private cqta(int i) {
        super(new Object[]{Integer.valueOf(i)});
        this.a = i;
    }

    public static cqta d(int i) {
        return new cqta(i);
    }

    public static cqta e(int i) {
        return d(i | (-16777216));
    }

    public static cqta f() {
        return d(0);
    }

    public static cqta g() {
        return d(-1);
    }

    public static cqta h() {
        return d(-16777216);
    }

    @Override // defpackage.cqss
    public final int b(Context context) {
        return this.a;
    }

    @Override // defpackage.cqss
    public final ColorStateList c(Context context) {
        return ColorStateList.valueOf(this.a);
    }
}
