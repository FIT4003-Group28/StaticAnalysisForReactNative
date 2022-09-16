package defpackage;

import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
/* compiled from: PG */
/* renamed from: heo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class heo implements zdt {
    public final /* synthetic */ zdt a;
    private final /* synthetic */ int b;

    public /* synthetic */ heo(zdt zdtVar) {
        this.a = zdtVar;
    }

    public /* synthetic */ heo(zdt zdtVar, int i) {
        this.b = i;
        this.a = zdtVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        int i = this.b;
        boolean z = true;
        if (i == 0) {
            zdt zdtVar = this.a;
            hiv hivVar = (hiv) obj;
            amuk amukVar = hes.a;
            if (hivVar == null || !hivVar.b) {
                z = false;
            }
            zdtVar.a(Boolean.valueOf(z));
        } else if (i == 1) {
            zdt zdtVar2 = this.a;
            amuk amukVar2 = hes.a;
            zep.d("Failed to load PDS", (Throwable) obj);
            zdtVar2.a(false);
        } else if (i == 2) {
            zdt zdtVar3 = this.a;
            aotz aotzVar = (aotz) obj;
            PermissionDescriptor[] permissionDescriptorArr = LiveCreationActivity.c;
            if (aotzVar == null || !aotzVar.i) {
                z = false;
            }
            zdtVar3.a(Boolean.valueOf(z));
        } else {
            zdt zdtVar4 = this.a;
            PermissionDescriptor[] permissionDescriptorArr2 = LiveCreationActivity.c;
            zep.d("Failed to load PDS", (Throwable) obj);
            zdtVar4.a(false);
        }
    }
}
