package com.google.android.apps.youtube.app.application.backup;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.BackupManager;
import android.app.backup.FileBackupHelper;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.FileObserver;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class YouTubeBackupAgent extends ykf {
    public static final Class[] a = {etk.class, fcw.class, ahfn.class, ahfo.class, vzx.class, ymf.class, agks.class, akzj.class, aeas.class, oky.class, ltp.class, lxy.class, eog.class, nwp.class};
    private static final Map f;
    public zen b;
    public aacz c;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("youtube", efi.a);
        f = hashMap;
    }

    public static FileObserver a(Context context) {
        efg efgVar = new efg(context.getDatabasePath("identity.db").getPath(), context);
        efgVar.startWatching();
        return efgVar;
    }

    public static void d(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("youtube", 0);
        if (!sharedPreferences.getBoolean("got_future_restore", false) || zfm.a(context) < sharedPreferences.getInt("future_restore_version", Integer.MAX_VALUE)) {
            return;
        }
        efh efhVar = new efh(sharedPreferences);
        zep.g("Triggering manual restore.");
        new BackupManager(context).requestRestore(efhVar);
    }

    public static void e(Context context) {
        BackupManager.dataChanged(context.getPackageName());
        context.getSharedPreferences("youtube", 0).edit().putBoolean("got_future_restore", false).apply();
    }

    public static boolean f(zen zenVar) {
        return zenVar == null || zenVar.e("enable_backup_and_restore", true);
    }

    public static void g(Context context) {
        context.getSharedPreferences("youtube", 0).registerOnSharedPreferenceChangeListener(new eff(context));
    }

    private final File k() {
        return getDatabasePath("identity.db");
    }

    private final File l() {
        return new File(getFilesDir(), "identity.db");
    }

    private static final void m(File file, File file2) {
        try {
            anhe.e(file, file2);
        } catch (IOException unused) {
            zep.g("Unable to copy identity database.");
        }
    }

    private static final void n(File file) {
        if (!file.delete()) {
            zep.g("Unable to delete identity database file from files directory.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ykf
    public final amuk b() {
        amuf f2 = amuk.f();
        f2.h(abga.g(getApplicationContext()));
        f2.h(ahfn.b(getApplicationContext()));
        f2.h(aiwv.i(getApplicationContext()));
        f2.h(yhr.a(getApplicationContext(), "commonui", "pivotbar_proto.pb"));
        f2.h(yhr.a(getApplicationContext(), "commonui", "topbar_proto.pb"));
        f2.h(ezv.e(getApplicationContext()));
        f2.h(yhr.a(getApplicationContext(), "commonui", "spatial_audio_mealbar_proto.pb"));
        f2.h(eog.a(getApplicationContext()));
        f2.h(nwp.a(getApplicationContext()));
        aacz aaczVar = this.c;
        if (aaczVar != null) {
            athd athdVar = aaczVar.b().o;
            if (athdVar == null) {
                athdVar = athd.a;
            }
            aujq aujqVar = athdVar.g;
            if (aujqVar == null) {
                aujqVar = aujq.a;
            }
            if (aujqVar.h) {
                f2.h(yhr.a(getApplicationContext(), "offline", "offlinemainbackedup.pb"));
            }
        }
        return f2.g();
    }

    @Override // defpackage.smy
    protected final Map c() {
        return f;
    }

    @Override // defpackage.ykf, defpackage.smy, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        if (!f(this.b)) {
            return;
        }
        File k = k();
        File l = l();
        m(k, l);
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        n(l);
    }

    @Override // defpackage.ykf, defpackage.smy, android.app.backup.BackupAgent
    public final void onCreate() {
        ampq ampqVar;
        String join;
        File file;
        File filesDir;
        Context applicationContext;
        YouTubeBackupAgent youTubeBackupAgent = this;
        int i = 0;
        while (true) {
            if (i < 10000) {
                if (youTubeBackupAgent != null) {
                    if (!(youTubeBackupAgent instanceof Application)) {
                        if (!(youTubeBackupAgent instanceof Service)) {
                            if (!(youTubeBackupAgent instanceof Activity)) {
                                if (youTubeBackupAgent instanceof ContextWrapper) {
                                    applicationContext = youTubeBackupAgent.getBaseContext();
                                } else {
                                    applicationContext = youTubeBackupAgent.getApplicationContext();
                                }
                                i++;
                                youTubeBackupAgent = applicationContext;
                            } else {
                                ampqVar = ampq.j(((Activity) youTubeBackupAgent).getApplication());
                                break;
                            }
                        } else {
                            ampqVar = ampq.j(((Service) youTubeBackupAgent).getApplication());
                            break;
                        }
                    } else {
                        ampqVar = ampq.j((Application) youTubeBackupAgent);
                        break;
                    }
                } else {
                    ampqVar = amon.a;
                    break;
                }
            } else {
                ampqVar = amon.a;
                break;
            }
        }
        ampq ampqVar2 = (ampq) ampqVar.b(new ampg() { // from class: zdr
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                Class cls = r1;
                Object G = zew.G((Application) obj);
                return ampq.i(cls.isInstance(G) ? cls.cast(G) : null);
            }
        }).d(gsh.n);
        if (!ampqVar2.h()) {
            zep.l("Skipping auto-backup due to unknown component");
            return;
        }
        ((efe) ampqVar2.c()).ih(this);
        if (!f(this.b)) {
            return;
        }
        addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
        this.d = yvv.c(getApplicationContext());
        this.e = yjt.a();
        amuk b = b();
        amxx amxxVar = (amxx) b;
        String[] strArr = new String[amxxVar.c];
        for (int i2 = 0; i2 < amxxVar.c; i2++) {
            Context applicationContext2 = getApplicationContext();
            vjb vjbVar = this.d;
            Uri uri = (Uri) b.get(i2);
            vkj b2 = vkj.b();
            b2.d();
            try {
                file = (File) vjbVar.c(uri, b2);
                filesDir = applicationContext2.getFilesDir();
            } catch (IOException e) {
                zep.d("Failed to find the file from given uri", e);
            }
            if (file.getPath().startsWith(filesDir.getPath())) {
                join = file.getPath().replace(filesDir.getPath(), "");
                strArr[i2] = join;
            }
            List<String> pathSegments = uri.getPathSegments();
            join = pathSegments.size() > 1 ? TextUtils.join(File.separator, pathSegments.subList(1, pathSegments.size())) : "";
            strArr[i2] = join;
        }
        addHelper("protodatastore", new FileBackupHelper(getApplicationContext(), strArr));
        addHelper("DATABASES", new FileBackupHelper(this, "identity.db"));
    }

    @Override // defpackage.ykf, defpackage.smy, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        Context applicationContext;
        int a2;
        if (f(this.b) && (a2 = zfm.a((applicationContext = getApplicationContext()))) != 0) {
            if (i > a2) {
                applicationContext.getSharedPreferences("youtube", 0).edit().putBoolean("got_future_restore", true).putInt("future_restore_version", i).apply();
                zep.g("Restore from future version skipped - will trigger a manual restore at next update.");
                return;
            }
            super.onRestore(backupDataInput, i, parcelFileDescriptor);
            zep.g("Restore initiated.");
            File l = l();
            m(l, k());
            n(l);
        }
    }
}
