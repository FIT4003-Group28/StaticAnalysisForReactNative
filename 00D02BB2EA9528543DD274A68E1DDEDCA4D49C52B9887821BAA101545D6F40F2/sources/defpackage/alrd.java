package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: alrd  reason: default package */
/* loaded from: classes2.dex */
public final class alrd {
    public static final alrc a(Object obj, Resources resources, alwc alwcVar, akpl akplVar, Context context, altp altpVar, akry akryVar, dxio<bnsn> dxioVar, akpq akpqVar, dxio<amyd> dxioVar2, dxio<akpe> dxioVar3, ammc ammcVar, Context context2, btmv btmvVar, ckcw ckcwVar, akwu akwuVar, cqat cqatVar, btvt btvtVar, bvnx bvnxVar, btrm btrmVar, cjvm cjvmVar, amoh amohVar, bvjj bvjjVar, akfa akfaVar, amfi amfiVar, amym amymVar, bvkx bvkxVar, dehq dehqVar, dehq dehqVar2, Executor executor, Executor executor2, dehq dehqVar3, ambz ambzVar, alvc alvcVar, hwv hwvVar, alyx alyxVar, @dzsi aliu aliuVar, dbty<Boolean> dbtyVar, dbty<Boolean> dbtyVar2, boolean z, @dzsi akpr akprVar, amyj amyjVar, anat anatVar, akrz akrzVar) {
        b(obj, 1);
        b("", 2);
        b(resources, 3);
        b(alwcVar, 4);
        b(akplVar, 5);
        b(context, 6);
        b(altpVar, 7);
        b(akryVar, 8);
        b(dxioVar, 9);
        b(akpqVar, 10);
        b(dxioVar2, 11);
        b(dxioVar3, 12);
        b(ammcVar, 13);
        b(context2, 14);
        b(btmvVar, 15);
        b(ckcwVar, 16);
        b(akwuVar, 17);
        b(cqatVar, 18);
        b(btvtVar, 19);
        b(bvnxVar, 20);
        b(btrmVar, 21);
        b(cjvmVar, 22);
        b(amohVar, 23);
        b(bvjjVar, 24);
        b(akfaVar, 25);
        b(amfiVar, 26);
        b(amymVar, 27);
        b(bvkxVar, 28);
        b(dehqVar, 29);
        b(dehqVar2, 30);
        b(executor, 31);
        b(executor2, 32);
        b(dehqVar3, 33);
        b(ambzVar, 34);
        b(alvcVar, 35);
        b(hwvVar, 36);
        b(alyxVar, 37);
        b(dbtyVar, 39);
        b(dbtyVar2, 40);
        b(amyjVar, 44);
        b(anatVar, 45);
        b(akrzVar, 46);
        return new alrc(obj, "", resources, alwcVar, akplVar, context, altpVar, akryVar, dxioVar, akpqVar, dxioVar2, dxioVar3, ammcVar, context2, btmvVar, ckcwVar, akwuVar, cqatVar, btvtVar, bvnxVar, btrmVar, cjvmVar, amohVar, bvjjVar, akfaVar, amfiVar, amymVar, bvkxVar, dehqVar, dehqVar2, executor, executor2, dehqVar3, ambzVar, alvcVar, hwvVar, alyxVar, aliuVar, dbtyVar, dbtyVar2, true, z, akprVar, amyjVar, anatVar, akrzVar, null, false);
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
