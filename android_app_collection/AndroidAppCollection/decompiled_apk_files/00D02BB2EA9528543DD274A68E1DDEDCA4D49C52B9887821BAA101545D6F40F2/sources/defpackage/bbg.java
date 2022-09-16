package defpackage;

import android.view.View;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: bbg  reason: default package */
/* loaded from: classes3.dex */
public final class bbg implements Comparator<View> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(View view, View view2) {
        baz bazVar = (baz) view.getLayoutParams();
        baz bazVar2 = (baz) view2.getLayoutParams();
        boolean z = bazVar.a;
        return z != bazVar2.a ? !z ? -1 : 1 : bazVar.e - bazVar2.e;
    }
}
