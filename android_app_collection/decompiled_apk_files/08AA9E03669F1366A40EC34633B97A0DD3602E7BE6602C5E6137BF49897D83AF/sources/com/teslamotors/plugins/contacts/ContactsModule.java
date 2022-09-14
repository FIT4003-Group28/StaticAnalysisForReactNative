package com.teslamotors.plugins.contacts;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.aq;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public class ContactsModule extends ReactContextBaseJavaModule {
    private static final String CONTACTS_NO_ERROR = "CONTACTS_NO_ERROR";
    private static final String CONTACTS_PERMISSION_ERROR = "CONTACTS_PERMISSION_ERROR";
    private static final String CONTACTS_UNKNOWN_ERROR = "CONTACTS_UNKNOWN_ERROR";
    private static final String REACT_CLASS = "TMContacts";
    private static final String RESULT = "result";
    private static final String VALUE = "value";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public ContactsModule(ah ahVar) {
        super(ahVar);
    }

    @al
    public void retrieveContactList(final af afVar) {
        final WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (!com.teslamotors.plugins.client.d.a.a(getReactApplicationContext())) {
            writableNativeMap.putString("result", CONTACTS_PERMISSION_ERROR);
            afVar.a(writableNativeMap);
            return;
        }
        com.teslamotors.plugins.client.d.a.a(getReactApplicationContext(), Arrays.asList("display_name", "first_name", "phone_numbers", "email_addresses"), new com.teslamotors.plugins.client.a.a() { // from class: com.teslamotors.plugins.contacts.ContactsModule.1
            @Override // com.teslamotors.plugins.client.a.a
            public void a(List<HashMap> list) {
                writableNativeMap.putString("result", ContactsModule.CONTACTS_NO_ERROR);
                writableNativeMap.a(ContactsModule.VALUE, ContactsModule.this.formattedContactList(list));
                afVar.a(writableNativeMap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public aq formattedContactList(List<HashMap> list) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (HashMap hashMap : list) {
            if (hashMap.get("display_name") != null) {
                List list2 = (List) hashMap.get("phone_numbers");
                List list3 = (List) hashMap.get("email_addresses");
                if ((list2 != null && list2.size() != 0) || (list3 != null && list3.size() != 0)) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("display_name", (String) hashMap.get("display_name"));
                    String str = (String) hashMap.get("first_name");
                    if (str != null) {
                        writableNativeMap.putString("first_name", str);
                    } else {
                        writableNativeMap.putString("first_name", "");
                    }
                    WritableNativeArray writableNativeArray2 = new WritableNativeArray();
                    List<String> list4 = (List) hashMap.get("phone_numbers");
                    if (list4 != null) {
                        for (String str2 : list4) {
                            writableNativeArray2.pushString(str2);
                        }
                    }
                    writableNativeMap.a("phone_numbers", writableNativeArray2);
                    WritableNativeArray writableNativeArray3 = new WritableNativeArray();
                    List<String> list5 = (List) hashMap.get("email_addresses");
                    if (list5 != null) {
                        for (String str3 : list5) {
                            writableNativeArray3.pushString(str3);
                        }
                    }
                    writableNativeMap.a("email_addresses", writableNativeArray3);
                    writableNativeArray.a(writableNativeMap);
                }
            }
        }
        return writableNativeArray;
    }
}
