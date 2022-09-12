package defpackage;

import java.util.Calendar;
/* compiled from: PG */
/* renamed from: bqa  reason: default package */
/* loaded from: classes4.dex */
public final class bqa implements Comparable<bqa> {
    public int a;
    public int b;
    public int c;
    private Calendar d;

    public bqa() {
        System.currentTimeMillis();
        throw null;
    }

    public bqa(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(bqa bqaVar) {
        int compare = Integer.compare(this.a, bqaVar.a);
        return (compare == 0 && (compare = Integer.compare(this.b, bqaVar.b)) == 0) ? Integer.compare(this.c, bqaVar.c) : compare;
    }

    public bqa(Calendar calendar) {
        this.a = calendar.get(1);
        this.b = calendar.get(2);
        this.c = calendar.get(5);
    }
}
