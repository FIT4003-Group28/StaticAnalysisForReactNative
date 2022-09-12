package defpackage;

import android.app.Activity;
import android.app.TimePickerDialog;
/* compiled from: PG */
/* renamed from: bptc  reason: default package */
/* loaded from: classes4.dex */
public class bptc {
    private final Activity a;

    public bptc(Activity activity) {
        this.a = activity;
    }

    public final void a(bpvw bpvwVar, boxe boxeVar, boolean z) {
        eaol eaolVar = z ? boxeVar.c : boxeVar.d;
        new jem(this.a, new bpta(eaolVar, z, boxeVar, bpvwVar), eaolVar.y(), eaolVar.z() - 1, eaolVar.A()).show();
    }

    public final void b(bpvw bpvwVar, boxe boxeVar, boolean z) {
        eaol eaolVar = z ? boxeVar.c : boxeVar.d;
        new TimePickerDialog(this.a, new bptb(eaolVar, z, boxeVar, bpvwVar), eaolVar.C(), eaolVar.D(), bpvwVar.a().booleanValue()).show();
    }
}
