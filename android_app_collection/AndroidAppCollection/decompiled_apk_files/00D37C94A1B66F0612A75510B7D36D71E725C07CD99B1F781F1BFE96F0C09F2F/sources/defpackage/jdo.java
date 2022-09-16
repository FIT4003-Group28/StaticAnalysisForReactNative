package defpackage;

import android.widget.CheckBox;
/* compiled from: PG */
/* renamed from: jdo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jdo implements zdt {
    public final /* synthetic */ jdy a;
    private final /* synthetic */ int b;

    public /* synthetic */ jdo(jdy jdyVar, int i) {
        this.b = i;
        this.a = jdyVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        boolean z = false;
        if (this.b == 0) {
            jdy jdyVar = this.a;
            String valueOf = String.valueOf((Throwable) obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("Failed to read the offlineStreamSelection value.");
            sb.append(valueOf);
            zep.b(sb.toString());
            jdyVar.g.setChecked(false);
            return;
        }
        Boolean bool = (Boolean) obj;
        CheckBox checkBox = this.a.g;
        if (bool != null && bool.booleanValue()) {
            z = true;
        }
        checkBox.setChecked(z);
    }
}
