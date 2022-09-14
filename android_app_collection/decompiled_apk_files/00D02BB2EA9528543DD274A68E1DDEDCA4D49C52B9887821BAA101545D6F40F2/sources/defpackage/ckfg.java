package defpackage;
/* compiled from: PG */
/* renamed from: ckfg  reason: default package */
/* loaded from: classes.dex */
public enum ckfg {
    ACTIONABLE_CONTENT("ActionableContentOnlyTimeToAppearLoaded", "ActionableContentOnlyTimeToAbandoned", "ActionableContentOnlyStatus"),
    APPEAR_LOADED("TimeToAppearLoaded", "TimeToAbandoned", "Status"),
    APPEAR_LOADED_WITH_IMAGES("WithImagesTimeToAppearLoaded", "WithImagesTimeToAbandoned", "WithImagesStatus");
    
    final String d;
    @dzsi
    final String e;
    @dzsi
    final String f;

    ckfg(String str, String str2, String str3) {
        this.d = str;
        this.e = str2;
        this.f = str3;
    }
}
