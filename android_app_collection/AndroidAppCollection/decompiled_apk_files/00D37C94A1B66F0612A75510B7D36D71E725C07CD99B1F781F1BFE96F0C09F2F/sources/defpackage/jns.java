package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: jns  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jns implements Runnable {
    public final /* synthetic */ jnw a;
    public final /* synthetic */ String b;
    public final /* synthetic */ yiw c;
    private final /* synthetic */ int d;

    public /* synthetic */ jns(jnw jnwVar, String str, yiw yiwVar) {
        this.a = jnwVar;
        this.b = str;
        this.c = yiwVar;
    }

    public /* synthetic */ jns(jnw jnwVar, String str, yiw yiwVar, int i) {
        this.d = i;
        this.a = jnwVar;
        this.b = str;
        this.c = yiwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final List emptyList;
        if (this.d != 0) {
            jnw jnwVar = this.a;
            final String str = this.b;
            final yiw yiwVar = this.c;
            if (jnwVar.a.j()) {
                emptyList = jnwVar.a().l(str);
            } else {
                emptyList = Collections.emptyList();
            }
            jnwVar.c.execute(new Runnable() { // from class: jnv
                @Override // java.lang.Runnable
                public final void run() {
                    yiw.this.b(str, emptyList);
                }
            });
            return;
        }
        jnw jnwVar2 = this.a;
        final String str2 = this.b;
        final yiw yiwVar2 = this.c;
        final agqh e = jnwVar2.a.j() ? jnwVar2.a().e(str2) : null;
        if (e != null) {
            jnwVar2.c.execute(new Runnable() { // from class: jnu
                @Override // java.lang.Runnable
                public final void run() {
                    yiw.this.b(str2, e);
                }
            });
        } else {
            jnwVar2.c.execute(new Runnable() { // from class: jnt
                @Override // java.lang.Runnable
                public final void run() {
                    yiw.this.a(str2, new IllegalArgumentException("No playlist by that id"));
                }
            });
        }
    }
}
