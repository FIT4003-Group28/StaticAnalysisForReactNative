package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: ukq  reason: default package */
/* loaded from: classes4.dex */
public final class ukq {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public Object b;
    public final usg c;

    public ukq(usg usgVar, byte[] bArr) {
        this.c = usgVar;
    }

    public final void a(ukl uklVar, Object obj) {
        if (obj == null) {
            return;
        }
        ukj a = uklVar.a(obj);
        a.a.add(this.c);
    }
}
