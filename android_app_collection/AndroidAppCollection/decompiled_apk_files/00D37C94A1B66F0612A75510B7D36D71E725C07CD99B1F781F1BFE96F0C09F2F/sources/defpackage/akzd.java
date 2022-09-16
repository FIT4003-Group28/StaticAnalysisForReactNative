package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
/* compiled from: PG */
/* renamed from: akzd  reason: default package */
/* loaded from: classes.dex */
public final class akzd {
    public final Context a;
    public final StorageManager b;
    private final ContentResolver c;

    public akzd(Context context) {
        this.a = context;
        this.c = context.getContentResolver();
        this.b = (StorageManager) context.getSystemService("storage");
    }

    public static File b(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        if (TextUtils.isEmpty(string)) {
            zep.m("StorageVolumeUtil", "Path is null");
            return null;
        }
        return new File(string);
    }

    public static boolean c(Uri uri) {
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 29 && !Environment.isExternalStorageLegacy();
    }

    public static int e(String str) {
        if (!TextUtils.isEmpty(str)) {
            if ("unknown".equals(str)) {
                return 4;
            }
            return ("mounted".equals(str) || "mounted_ro".equals(str)) ? 2 : 3;
        }
        return 1;
    }

    public static void f(aopa aopaVar, File file, File file2) {
        int e = e(Environment.getExternalStorageState(file));
        aopaVar.copyOnWrite();
        alcx alcxVar = (alcx) aopaVar.instance;
        alcx alcxVar2 = alcx.a;
        alcxVar.d = e - 1;
        alcxVar.b |= 2;
        if (e == 2 || e == 3) {
            file2.getAbsolutePath().contains(file.getAbsolutePath());
            String absolutePath = file.getAbsolutePath();
            aopaVar.copyOnWrite();
            alcx alcxVar3 = (alcx) aopaVar.instance;
            absolutePath.getClass();
            alcxVar3.b |= 4;
            alcxVar3.e = absolutePath;
            boolean isExternalStorageRemovable = Environment.isExternalStorageRemovable(file);
            aopaVar.copyOnWrite();
            alcx alcxVar4 = (alcx) aopaVar.instance;
            alcxVar4.b |= 8;
            alcxVar4.f = isExternalStorageRemovable;
        }
    }

    public final Cursor a(Uri uri) {
        long parseId = ContentUris.parseId(uri);
        ContentResolver contentResolver = this.c;
        Uri contentUri = MediaStore.Files.getContentUri("external");
        String[] strArr = new String[1];
        strArr[0] = Build.VERSION.SDK_INT >= 29 ? "volume_name" : "_data";
        Cursor query = contentResolver.query(contentUri, strArr, "_id = ?", new String[]{String.valueOf(parseId)}, null);
        if (query == null) {
            return null;
        }
        if (query.moveToFirst()) {
            return query;
        }
        query.close();
        return null;
    }

    public final void g(aopa aopaVar, StorageVolume storageVolume) {
        int e = e(storageVolume.getState());
        aopaVar.copyOnWrite();
        alcx alcxVar = (alcx) aopaVar.instance;
        alcx alcxVar2 = alcx.a;
        alcxVar.d = e - 1;
        alcxVar.b |= 2;
        if (e == 2 || e == 3) {
            String uuid = storageVolume.getUuid();
            if (TextUtils.isEmpty(uuid)) {
                uuid = storageVolume.getDescription(this.a);
            }
            aopaVar.copyOnWrite();
            alcx alcxVar3 = (alcx) aopaVar.instance;
            uuid.getClass();
            alcxVar3.b |= 4;
            alcxVar3.e = uuid;
            boolean isRemovable = storageVolume.isRemovable();
            aopaVar.copyOnWrite();
            alcx alcxVar4 = (alcx) aopaVar.instance;
            alcxVar4.b |= 8;
            alcxVar4.f = isRemovable;
        }
    }
}
