package defpackage;

import android.content.ComponentName;
/* renamed from: umv  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class umv implements dbsl {
    static final dbsl a = new umv();

    private umv() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        afga afgaVar = (afga) obj;
        ComponentName component = afgaVar.a.getComponent();
        return "com.google.android.maps.MapsActivity".equals(component == null ? null : component.getShortClassName()) && afgaVar.a.hasExtra("DirectionsGmmIntentdestinations");
    }
}
