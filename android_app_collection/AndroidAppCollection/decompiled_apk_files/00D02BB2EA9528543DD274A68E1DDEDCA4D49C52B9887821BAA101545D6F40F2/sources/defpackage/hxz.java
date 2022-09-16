package defpackage;
/* compiled from: PG */
/* renamed from: hxz  reason: default package */
/* loaded from: classes6.dex */
public abstract class hxz {
    public abstract hya a();

    public abstract void b(@dzsi CharSequence charSequence);

    public abstract void c(cjtd cjtdVar);

    public final void d(@dzsi Integer num) {
        if (num == null) {
            b(null);
        } else if (num.intValue() <= 0) {
            b(null);
        } else if (num.intValue() > 99) {
            b("99");
        } else {
            b(String.valueOf(num));
        }
    }
}
