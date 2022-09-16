package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: blo  reason: default package */
/* loaded from: classes2.dex */
public final class blo {
    final Context a;
    public String b;
    public bln c;
    public boolean d;

    public blo(Context context) {
        this.a = context;
    }

    public final blp a() {
        if (this.c != null) {
            if (this.a != null) {
                if (!this.d || !TextUtils.isEmpty(this.b)) {
                    return new blp(this.a, this.b, this.c, this.d);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }
}
