package defpackage;

import java.io.Serializable;
import java.util.Calendar;
/* compiled from: PG */
/* renamed from: boki  reason: default package */
/* loaded from: classes3.dex */
public class boki implements Serializable {
    public boolean a;
    public boolean b;
    public final bokh c;
    public final bokh d;
    public final bokh e;

    public boki() {
        Calendar calendar = Calendar.getInstance();
        this.a = false;
        this.b = false;
        this.c = new bokh(calendar.get(5));
        this.d = new bokh(calendar.get(2) + 1);
        this.e = new bokh(calendar.get(1));
    }
}
