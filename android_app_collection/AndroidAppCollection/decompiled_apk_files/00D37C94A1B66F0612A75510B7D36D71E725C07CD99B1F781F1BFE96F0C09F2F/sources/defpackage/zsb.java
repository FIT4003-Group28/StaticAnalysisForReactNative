package defpackage;

import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
/* compiled from: PG */
/* renamed from: zsb  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zsb implements zrm {
    public final /* synthetic */ zsc a;
    private final /* synthetic */ int b;

    public /* synthetic */ zsb(zsc zscVar) {
        this.a = zscVar;
    }

    public /* synthetic */ zsb(zsc zscVar, int i) {
        this.b = i;
        this.a = zscVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            zsc zscVar = this.a;
            zscVar.w = true;
            if (!FilterMapTable$FilterDescriptor.h(((FilterMapTable$FilterDescriptor) obj).a)) {
                zscVar.k(avxu.EFFECT_SUBPACKAGE_ID_EXPRESSIVE).j(true);
                zscVar.k(avxu.EFFECT_SUBPACKAGE_ID_PRESET).j(false);
            } else {
                zscVar.q();
            }
            zscVar.w = false;
            return;
        }
        zsc zscVar2 = this.a;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = (FilterMapTable$FilterDescriptor) obj;
        if (zscVar2.w) {
            return;
        }
        zscVar2.k(avxu.EFFECT_SUBPACKAGE_ID_EXPRESSIVE).c("NORMAL");
        zscVar2.q();
    }
}
