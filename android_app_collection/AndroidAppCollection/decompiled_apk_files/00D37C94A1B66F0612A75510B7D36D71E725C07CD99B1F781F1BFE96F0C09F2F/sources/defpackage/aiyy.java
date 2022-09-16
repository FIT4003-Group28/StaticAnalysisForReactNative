package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.apps.tiktok.account.api.controller.AccountActionResult;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
/* compiled from: PG */
/* renamed from: aiyy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aiyy implements ampg {
    private final /* synthetic */ int v;
    public static final /* synthetic */ aiyy u = new aiyy(20);
    public static final /* synthetic */ aiyy t = new aiyy(19);
    public static final /* synthetic */ aiyy s = new aiyy(18);
    public static final /* synthetic */ aiyy r = new aiyy(17);
    public static final /* synthetic */ aiyy q = new aiyy(16);
    public static final /* synthetic */ aiyy p = new aiyy(15);
    public static final /* synthetic */ aiyy o = new aiyy(14);
    public static final /* synthetic */ aiyy n = new aiyy(13);
    public static final /* synthetic */ aiyy m = new aiyy(12);
    public static final /* synthetic */ aiyy l = new aiyy(11);
    public static final /* synthetic */ aiyy k = new aiyy(10);
    public static final /* synthetic */ aiyy j = new aiyy(9);
    public static final /* synthetic */ aiyy i = new aiyy(8);
    public static final /* synthetic */ aiyy h = new aiyy(7);
    public static final /* synthetic */ aiyy g = new aiyy(6);
    public static final /* synthetic */ aiyy f = new aiyy(5);
    public static final /* synthetic */ aiyy e = new aiyy(4);
    public static final /* synthetic */ aiyy d = new aiyy(3);
    public static final /* synthetic */ aiyy c = new aiyy(2);
    public static final /* synthetic */ aiyy b = new aiyy(1);
    public static final /* synthetic */ aiyy a = new aiyy();

    private /* synthetic */ aiyy() {
    }

    private /* synthetic */ aiyy(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return ((airw) obj).V();
            case 1:
                return ((ajff) obj).R();
            case 2:
                return ((ajff) obj).t();
            case 3:
                return ((ajff) obj).u();
            case 4:
                return ((ajff) obj).v();
            case 5:
                return ((ajff) obj).C();
            case 6:
                return ((ajff) obj).I();
            case 7:
                return ((ajff) obj).M();
            case 8:
                return ((ajff) obj).W();
            case 9:
                return Boolean.valueOf(((Activity) obj).isFinishing());
            case 10:
                return new ajuo(((Long) obj).longValue());
            case 11:
                return Boolean.valueOf(((awvj) obj).d);
            case 12:
                awvj awvjVar = (awvj) obj;
                return Long.toString(awvjVar == null ? -1L : awvjVar.e);
            case 13:
                aurp aurpVar = (aurp) obj;
                if (aurpVar.b == 64166933) {
                    return (auro) aurpVar.c;
                }
                return auro.a;
            case 14:
                return ajgl.b((arag) obj);
            case 15:
                arag aragVar = ((atpl) obj).c;
                return aragVar == null ? arag.a : aragVar;
            case 16:
                return ((akvj) obj).h;
            case 17:
                if (((Boolean) obj).booleanValue()) {
                    return ValidationResult.d();
                }
                throw new alzy();
            case 18:
                IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj;
                throw new alzy();
            case 19:
                ValidationResult validationResult = (ValidationResult) obj;
                return validationResult == null ? ValidationResult.d() : validationResult;
            default:
                return new AccountActionResult(null, ambp.a, null, (Intent) obj);
        }
    }
}
