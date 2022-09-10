package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyqw  reason: default package */
/* loaded from: classes5.dex */
public final class cyqw {
    public final cyph a;
    private final czgl b;

    public cyqw(cyph cyphVar, czgl czglVar) {
        this.a = cyphVar;
        this.b = czglVar;
    }

    public final void a(avu avuVar) {
        cyph cyphVar = this.a;
        dbtp b = cyphVar == null ? null : cyphVar.b();
        avuVar.h("DROP TABLE Tokens");
        avuVar.h("CREATE VIRTUAL TABLE IF NOT EXISTS `Tokens` USING FTS4(`contact_id` INTEGER NOT NULL, `value` TEXT, `affinity` REAL NOT NULL, `field_type` TEXT, tokenize=unicode61 `tokenchars=@.-`, notindexed=`contact_id`, notindexed=`affinity`, notindexed=`field_type`, prefix=`1`)");
        try {
            Cursor g = avuVar.g(new avt("SELECT * FROM Contacts ORDER BY id ASC"));
            int columnIndex = g.getColumnIndex("id");
            int columnIndex2 = g.getColumnIndex("proto_bytes");
            ArrayList<cysn> arrayList = new ArrayList();
            ContentValues contentValues = new ContentValues();
            while (g.moveToNext()) {
                if (!g.isNull(columnIndex2)) {
                    this.b.a(arrayList, g.getLong(columnIndex), (dsgk) dsqw.cr(dsgk.c, g.getBlob(columnIndex2), dsqa.c()));
                    for (cysn cysnVar : arrayList) {
                        contentValues.put("contact_id", Long.valueOf(cysnVar.a));
                        contentValues.put("value", cysnVar.b);
                        contentValues.put("affinity", Double.valueOf(cysnVar.c));
                        contentValues.put("field_type", cysn.b(cysnVar.d));
                        ((awd) avuVar).b.insertWithOnConflict("Tokens", null, contentValues, 1);
                    }
                    arrayList.clear();
                }
            }
            if (g != null) {
                g.close();
            }
        } catch (dsrm unused) {
            cyph cyphVar2 = this.a;
            if (cyphVar2 != null) {
                cypg.c(cyphVar2, 21, 10, cyor.a);
            }
            avuVar.h("DELETE FROM CacheInfo");
            avuVar.h("DELETE FROM Contacts");
            avuVar.h("DELETE FROM Tokens");
        }
        cyph cyphVar3 = this.a;
        if (cyphVar3 == null || b == null) {
            return;
        }
        cypg.a(cyphVar3, 64, b, cyor.a);
    }
}
