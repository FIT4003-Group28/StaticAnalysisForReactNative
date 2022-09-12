package defpackage;

import android.content.Context;
import android.os.Parcelable;
/* compiled from: PG */
/* renamed from: coaw  reason: default package */
/* loaded from: classes5.dex */
public final class coaw {
    public final Object a;

    public coaw(Class<?> cls, Context context, Parcelable parcelable) {
        try {
            this.a = cls.getDeclaredConstructor(Context.class, Parcelable.class).newInstance(context, parcelable);
        } catch (Exception e) {
            throw new coas(e);
        }
    }
}
