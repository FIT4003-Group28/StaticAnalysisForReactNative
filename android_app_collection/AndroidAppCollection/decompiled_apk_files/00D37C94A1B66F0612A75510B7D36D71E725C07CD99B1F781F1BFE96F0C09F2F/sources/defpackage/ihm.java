package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ihm  reason: default package */
/* loaded from: classes3.dex */
public final class ihm extends afyl {
    public boolean a;
    public boolean b;
    private final afvm c;
    private final afxq k;
    private final ContentResolver l;
    private final cfa m;

    public ihm(String str, afvm afvmVar, afxq afxqVar, ContentResolver contentResolver, cfa cfaVar) {
        super(1, str, (cez) null);
        afvmVar.getClass();
        this.c = afvmVar;
        this.k = afxqVar;
        contentResolver.getClass();
        this.l = contentResolver;
        this.m = cfaVar;
    }

    @Override // defpackage.yua
    public final cff d(cff cffVar) {
        this.b = true;
        return cffVar;
    }

    @Override // defpackage.afyl, defpackage.afye
    public final afvm e() {
        return this.c;
    }

    @Override // defpackage.yua
    public final Map f() {
        HashMap hashMap = new HashMap();
        this.k.b(hashMap, this);
        return hashMap;
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        String str = (String) cewVar.c.get("content-type");
        if (str == null || !str.equals("video/mp4")) {
            this.b = true;
        } else if (!this.a) {
            byte[] bArr = cewVar.b;
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
            file.mkdirs();
            if (!file.isDirectory() || !file.canWrite()) {
                zep.b("Camera roll directory not accessible.");
                this.b = true;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                String format = new SimpleDateFormat("'VID'_yyyyMMdd_HHmmss", Locale.US).format(new Date(currentTimeMillis));
                File file2 = new File(file, String.valueOf(format).concat(".mp4"));
                try {
                    file2.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(bArr, 0, bArr.length);
                    fileOutputStream.close();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("media_type", (Integer) 3);
                    contentValues.put("_data", file2.getAbsolutePath());
                    contentValues.put("_size", Long.valueOf(file2.length()));
                    contentValues.put("_display_name", file2.getName());
                    contentValues.put("title", format);
                    Long valueOf = Long.valueOf(currentTimeMillis);
                    contentValues.put("date_added", valueOf);
                    contentValues.put("date_modified", Long.valueOf(currentTimeMillis / 1000));
                    contentValues.put("mime_type", "video/mp4");
                    contentValues.put("datetaken", valueOf);
                    this.l.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                } catch (IOException | SecurityException unused) {
                    zep.b("Failed saving downloaded video to camera roll.");
                    this.b = true;
                }
            }
        }
        return cfb.b(null, null);
    }

    @Override // defpackage.yua
    public final /* bridge */ /* synthetic */ void qz(Object obj) {
        this.m.lG((Void) obj);
    }
}
