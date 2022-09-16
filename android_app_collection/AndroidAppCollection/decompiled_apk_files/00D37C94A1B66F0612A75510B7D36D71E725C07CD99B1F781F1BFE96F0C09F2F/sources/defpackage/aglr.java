package defpackage;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aglr  reason: default package */
/* loaded from: classes.dex */
public final class aglr {
    public static final String[] a = {"video_id", "itag", "storage_id", "merkle_level", "block_index", "digest", "hash_state", "matches_bytes_on_disk"};
    public final agli b;
    public final List c = new ArrayList();

    public aglr(agli agliVar) {
        this.b = agliVar;
    }

    public final ContentValues a(agqd agqdVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("video_id", agqdVar.a);
        contentValues.put("itag", Integer.valueOf(agqdVar.b));
        contentValues.put("storage_id", agqdVar.c);
        contentValues.put("merkle_level", Integer.valueOf(agqdVar.d));
        contentValues.put("block_index", Integer.valueOf(agqdVar.e));
        contentValues.put("digest", agqdVar.f);
        contentValues.put("hash_state", agqdVar.g);
        contentValues.put("matches_bytes_on_disk", Boolean.valueOf(agqdVar.h));
        return contentValues;
    }
}
