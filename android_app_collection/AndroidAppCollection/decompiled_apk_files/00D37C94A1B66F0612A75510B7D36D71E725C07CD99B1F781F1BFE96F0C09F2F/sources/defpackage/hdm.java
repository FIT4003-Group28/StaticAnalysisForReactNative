package defpackage;

import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
/* compiled from: PG */
/* renamed from: hdm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hdm implements zrm {
    public final /* synthetic */ hdq a;
    private final /* synthetic */ int b;

    public /* synthetic */ hdm(hdq hdqVar) {
        this.a = hdqVar;
    }

    public /* synthetic */ hdm(hdq hdqVar, int i) {
        this.b = i;
        this.a = hdqVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            hdq hdqVar = this.a;
            FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = (FilterMapTable$FilterDescriptor) obj;
            hdqVar.a.runOnUiThread(new hdn(hdqVar, 1));
        } else if (i == 1) {
            hdq hdqVar2 = this.a;
            hdqVar2.j = (FilterMapTable$FilterDescriptor) obj;
            hdqVar2.c();
        } else {
            hdq hdqVar3 = this.a;
            FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 = (FilterMapTable$FilterDescriptor) obj;
            if (hdqVar3.e == null || filterMapTable$FilterDescriptor2 == null) {
                return;
            }
            hdqVar3.a.runOnUiThread(new hdn(hdqVar3));
        }
    }
}
