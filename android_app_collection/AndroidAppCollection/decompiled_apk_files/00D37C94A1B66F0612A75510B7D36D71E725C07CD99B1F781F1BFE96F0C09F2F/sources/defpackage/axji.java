package defpackage;

import java.util.Date;
/* compiled from: PG */
/* renamed from: axji  reason: default package */
/* loaded from: classes2.dex */
public final class axji implements Cloneable {
    public long b;
    public double f;
    public double g;
    public float h;
    public int j;
    public String a = "eng";
    public Date c = new Date();
    public Date d = new Date();
    public axlh e = axlh.a;
    public long i = 1;

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
