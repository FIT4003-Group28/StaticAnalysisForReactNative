package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anmd  reason: default package */
/* loaded from: classes2.dex */
public final class anmd {
    public final ArrayList<Runnable> a = new ArrayList<>();
    final /* synthetic */ anme b;

    public anmd(anme anmeVar) {
        this.b = anmeVar;
    }

    public final void a() {
        ArrayList<Runnable> arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).run();
        }
    }
}
