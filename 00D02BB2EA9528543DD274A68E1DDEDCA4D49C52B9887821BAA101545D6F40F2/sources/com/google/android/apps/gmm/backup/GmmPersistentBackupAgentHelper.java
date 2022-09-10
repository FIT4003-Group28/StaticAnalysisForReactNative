package com.google.android.apps.gmm.backup;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes.dex */
public class GmmPersistentBackupAgentHelper extends cqas {
    @dzsi
    public static ckcw a;
    @dzsi
    public static akfa b;

    private static void f(SharedPreferences sharedPreferences, String str) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(str, sharedPreferences.getInt(str, 0) + 1);
        edit.commit();
    }

    @Override // defpackage.cqas
    public final Map<String, dyv> a() {
        dcdg p = dcdn.p();
        dbsk.s(b);
        p.f(btlu.i(b.k()) == btlt.INCOGNITO ? bvjj.b : bvjj.a, new dyv());
        return p.b();
    }

    @Override // defpackage.cqas
    protected final void b(Set<String> set) {
        if (set.contains(bvjj.a)) {
            SharedPreferences sharedPreferences = getSharedPreferences(bvjj.a, 0);
            f(sharedPreferences, bvjk.hi.toString());
            dyx.b(sharedPreferences);
            f(sharedPreferences, bvjk.hj.toString());
        }
    }

    @Override // defpackage.cqas, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        ckcw ckcwVar = a;
        if (ckcwVar != null) {
            ((ckcn) ckcwVar.a(ckdo.b)).a();
        }
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        ckcw ckcwVar2 = a;
        if (ckcwVar2 != null) {
            ((ckcn) ckcwVar2.a(ckdo.c)).a();
        }
    }

    @Override // defpackage.cqas, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        SharedPreferences sharedPreferences = getSharedPreferences(bvjj.a, 0);
        f(sharedPreferences, bvjk.hg.toString());
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        f(sharedPreferences, bvjk.hh.toString());
    }
}
