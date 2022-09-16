package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ibk  reason: default package */
/* loaded from: classes3.dex */
public abstract class ibk extends yo {
    public ibk(View view) {
        super(view);
        view.setTag(this);
    }

    public static ibk G(View view) {
        Object tag = view.getTag();
        if (tag instanceof ibk) {
            return (ibk) tag;
        }
        return null;
    }

    public abstract iaj E();

    public abstract void F();
}
