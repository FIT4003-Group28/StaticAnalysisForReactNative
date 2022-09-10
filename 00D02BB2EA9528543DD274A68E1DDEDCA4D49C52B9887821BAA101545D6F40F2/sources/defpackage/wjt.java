package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: wjt  reason: default package */
/* loaded from: classes7.dex */
public class wjt implements wjl, cqkn {
    private final List<wpv> a;

    public wjt(doog doogVar, List<wpv> list) {
        String str = doogVar.b;
        this.a = Collections.unmodifiableList(list);
    }

    @Override // defpackage.wjl
    public List<wpv> b() {
        return this.a;
    }

    @Override // defpackage.cqkn
    /* renamed from: c */
    public void a(wjl wjlVar, View view) {
        List<wpv> b = wjlVar.b();
        if (b.isEmpty() || !(b.get(0) instanceof wsl)) {
            return;
        }
        wsl wslVar = (wsl) b.get(0);
        wslVar.a(wslVar, view);
    }
}
