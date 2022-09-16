package defpackage;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FileBackupHelper;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.List;
/* compiled from: PG */
/* renamed from: ykf  reason: default package */
/* loaded from: classes4.dex */
public abstract class ykf extends smy {
    public vjb d;
    public yjt e;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract amuk b();

    @Override // defpackage.smy, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        yjt yjtVar;
        try {
            try {
                this.e.b();
                super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
                yjtVar = this.e;
            } catch (InterruptedException unused) {
                Thread.interrupted();
                yjtVar = this.e;
            }
            yjtVar.d();
        } catch (Throwable th) {
            this.e.d();
            throw th;
        }
    }

    @Override // defpackage.smy, android.app.backup.BackupAgent
    public void onCreate() {
        String join;
        File file;
        File filesDir;
        addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
        this.d = yvv.c(getApplicationContext());
        this.e = yjt.a();
        amuk b = b();
        amxx amxxVar = (amxx) b;
        String[] strArr = new String[amxxVar.c];
        for (int i = 0; i < amxxVar.c; i++) {
            Context applicationContext = getApplicationContext();
            vjb vjbVar = this.d;
            Uri uri = (Uri) b.get(i);
            vkj b2 = vkj.b();
            b2.d();
            try {
                file = (File) vjbVar.c(uri, b2);
                filesDir = applicationContext.getFilesDir();
            } catch (IOException e) {
                zep.d("Failed to find the file from given uri", e);
            }
            if (file.getPath().startsWith(filesDir.getPath())) {
                join = file.getPath().replace(filesDir.getPath(), "");
                strArr[i] = join;
            }
            List<String> pathSegments = uri.getPathSegments();
            join = pathSegments.size() > 1 ? TextUtils.join(File.separator, pathSegments.subList(1, pathSegments.size())) : "";
            strArr[i] = join;
        }
        addHelper("protodatastore", new FileBackupHelper(getApplicationContext(), strArr));
    }

    @Override // defpackage.smy, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        yjt yjtVar;
        try {
            try {
                this.e.b();
                super.onRestore(backupDataInput, i, parcelFileDescriptor);
                yjtVar = this.e;
            } catch (InterruptedException unused) {
                Thread.interrupted();
                yjtVar = this.e;
            }
            yjtVar.d();
        } catch (Throwable th) {
            this.e.d();
            throw th;
        }
    }
}
